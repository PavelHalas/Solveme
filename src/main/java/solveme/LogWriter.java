/**
 * File:    LoggerBackEnd.java
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
 * Writes a message to a file/database/console/whatever.
 * 
 * No need to implement this interface!
 */
public interface LogWriter {

    void write(Long timestamp, Severity severity, String category, String message);
}
