/**
 * File:    RateUpdater.java
 * Author:  Pavel Halas
 * Created: 24 Jan 2014
 *
 * Copyright (c) 2014 Wall Street Systems, Delaware Inc.
 * All Rights reserved.
 *
 * This software is proprietary and confidential to Wall Street Systems, Delaware Inc.
 * and is protected by copyright law as an unpublished work.
 * Unauthorized access and disclosure strictly forbidden.
 */
package solveme;

/**
 * Application interface to log messages.
 */
public interface Log {

    void debug(String message);

    void info(String message);

    void error(String message);
}
