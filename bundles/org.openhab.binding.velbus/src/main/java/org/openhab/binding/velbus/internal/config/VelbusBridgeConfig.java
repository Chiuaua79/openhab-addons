/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.velbus.internal.config;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link VelbusBridgeConfig} class represents the configuration of a Velbus Bridge.
 *
 * @author Cedric Boon - Initial contribution
 */
@NonNullByDefault
public class VelbusBridgeConfig {
    public int timeUpdateInterval;
    public int reconnectionInterval;
}
