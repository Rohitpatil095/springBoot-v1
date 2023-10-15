package com.db.day02.customeDataDao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.day02.entity.Bank;

import jakarta.persistence.Entity;

@Service
public class customeData {
	
//	@Autowired
	private Bank nBank=new Bank();	
	ArrayList<Bank> allBanks= new ArrayList<Bank>(10);
	
	public customeData()
	{			
		String[] bNames=new String[]{"adsd","dwe","dwrew"};
		int[] totalAmonut= new int[] {24,565,768};
		boolean[] isInLoss= new boolean[]{true,false,false};
		
		for(int i=0;i<bNames.length;i++)
		{
			nBank.setBname(bNames[i]);
			nBank.setTotalAmount(totalAmonut[i]);
			nBank.setInLoss(isInLoss[i]);
			allBanks.add(nBank);
		}
	}
	
	
	public ArrayList<Bank> banks()
	{
		return allBanks;
	}
	
}
