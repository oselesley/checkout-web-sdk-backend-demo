/*
 * Copyright (c) 2022 Payoneer Germany GmbH. All rights reserved.
 */
package com.optile.checkoutwebsdkdemo.services.serviceimpl;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.optile.checkoutwebsdkdemo.services.ConfigurationService;
import com.oscato.service.network.impl.reader.NetworkModel;
import com.oscato.service.network.impl.reader.NetworkReader;

/**
 * @author Alex Dereviago
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {
	private RestTemplate restTemplate = new RestTemplate();
	@Override
	public NetworkModel getConfiguration(final String network, final String formType) {
		NetworkReader networkReader = new NetworkReader();
		NetworkModel model = networkReader.getJson(network);
		model.setForms(model.getForms().stream().filter(form -> form.getType().equalsIgnoreCase(formType)).collect(Collectors.toList()));
		return model;
	}
}
