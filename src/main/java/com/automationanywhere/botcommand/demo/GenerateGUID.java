/*
 * Copyright (c) 2019 Automation Anywhere.
 * All rights reserved.
 *
 * This software is the proprietary information of Automation Anywhere.
 * You shall use it only in accordance with the terms of the license agreement
 * you entered into with Automation Anywhere.
 */
/**
 *
 */
package com.automationanywhere.botcommand.demo;

import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.impl.StringValue;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;
import com.automationanywhere.commandsdk.model.DataType;

import static com.automationanywhere.commandsdk.model.AttributeType.TEXT;
import static com.automationanywhere.commandsdk.model.DataType.STRING;

import java.util.UUID;

/**
 * @author Bren Sapience
 *
 */
@BotCommand
@CommandPkg(label="Generate GUID", name="generate guid", description="Generate a new GUID", icon="pkg.svg",
		node_label="generate a GUID",
		return_type=STRING, return_label="Assign the output to variable", return_required=true)

public class GenerateGUID {

	private static final Messages MESSAGES = MessagesFactory.getMessages("com.automationanywhere.botcommand.demo.messages");

	@Execute
	public Value<String> action() {

		UUID uuid = UUID.randomUUID();
		//long ts = uuid.timestamp();
		//System.out.println("DEBUG"+uuid.version());
		//System.out.println("DEBUG"+uuid.variant());
		return new StringValue(uuid.toString());

	}


}
