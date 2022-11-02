/*
 * Copyright (c) 2022 Payoneer Germany GmbH. All rights reserved.
 */
package com.optile.checkoutwebsdkdemo.services;

import com.oscato.service.network.impl.reader.NetworkModel;

/**
 * @author Alex Dereviago
 */
public interface ConfigurationService {
	NetworkModel getConfiguration();
}
