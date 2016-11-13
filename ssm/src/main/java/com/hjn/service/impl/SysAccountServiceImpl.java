package com.hjn.service.impl;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjn.dao.SysAccountMapper;
import com.hjn.entity.SysAccount;
import com.hjn.exception.CustomException;
import com.hjn.service.SysAccountService;
import com.hjn.util.Bytes;
import com.hjn.util.Digests;

@Service
@Transactional
public class SysAccountServiceImpl implements SysAccountService {

	@Resource
	private SysAccountMapper sysAccountDao;
	
	@Override
	public void deleteByPrimaryKey(Long id) {
		sysAccountDao.deleteByPrimaryKey(id);
	}

	@Override
	public void insertSelective(SysAccount record) {
		sysAccountDao.insertSelective(record);
	}

	@Override
	public SysAccount selectByPrimaryKey(Long id) {
		SysAccount sysAccount = sysAccountDao.selectByPrimaryKey(id);
		return sysAccount;
	}

	@Override
	public void updateByPrimaryKeySelective(SysAccount record) {
		sysAccountDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void login(String loginName, String password) throws CustomException {
		SysAccount sysAccount = sysAccountDao.selectByLoginName(loginName);
		if(sysAccount != null){
			StringBuffer saltPassword = new StringBuffer();
			saltPassword.append(password).append(sysAccount.getSalt());
			String md5Password = getMd5FromString(saltPassword.toString());
			if(md5Password.equals(sysAccount.getPassword())){
				
			}else{
				throw new CustomException("用户或密码错误");
			}
		}else{
			throw new CustomException("用户或密码错误");
		}
		
	}

	@Override
	public void register(SysAccount sysAccount) {
		
		String salt = RandomStringUtils.randomAlphabetic(32);
		String saltPassword = sysAccount.getPassword()+salt;
		String md5Password = getMd5FromString(saltPassword);
		sysAccount.setPassword(md5Password);
		sysAccount.setSalt(salt);
		
		sysAccountDao.insertSelective(sysAccount);
		
	}
	
	private String getMd5FromString(String source){
		byte[] bytePassword;
		String md5Password = null;
		try {
			bytePassword = Digests.md5(source.getBytes());
			md5Password = Bytes.toHex(bytePassword);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return md5Password;
	}

}
