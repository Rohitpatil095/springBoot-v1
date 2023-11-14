package com.app.brewcans.web.services;

import java.util.UUID;

import com.app.brewcans.web.models.CustomerDto;

public interface CustServices {
	public CustomerDto getCustById(UUID custId);
}
