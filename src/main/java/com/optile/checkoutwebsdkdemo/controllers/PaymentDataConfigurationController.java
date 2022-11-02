/*
 * Copyright (c) 2022 Payoneer Germany GmbH. All rights reserved.
 */
package com.optile.checkoutwebsdkdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optile.checkoutwebsdkdemo.services.ConfigurationService;
import com.oscato.service.network.impl.reader.NetworkModel;

/**
 * @author Alex Dereviago
 *
 */
@RestController
@RequestMapping("/configuration")
public class PaymentDataConfigurationController {
	@Autowired
	private ConfigurationService resourceService;

	@GetMapping("/networks/{network}/forms/{formType}")
	public ResponseEntity<NetworkModel> getConfigurationData(@PathVariable final String network, @PathVariable final String formType) {
		return new ResponseEntity<>(resourceService.getConfiguration(network, formType), HttpStatus.OK);
	}
}
