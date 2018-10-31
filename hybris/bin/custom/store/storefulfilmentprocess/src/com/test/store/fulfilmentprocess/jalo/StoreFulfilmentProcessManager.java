/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.test.store.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.test.store.fulfilmentprocess.constants.StoreFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class StoreFulfilmentProcessManager extends GeneratedStoreFulfilmentProcessManager
{
	public static final StoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (StoreFulfilmentProcessManager) em.getExtension(StoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
