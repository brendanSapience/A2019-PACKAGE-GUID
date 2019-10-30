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
import com.automationanywhere.commandsdk.annotations.*;
import com.automationanywhere.commandsdk.annotations.rules.NotEmpty;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;
import com.automationanywhere.commandsdk.model.AttributeType;

import java.util.UUID;

import static com.automationanywhere.commandsdk.model.DataType.STRING;

/**
 * @author Bren Sapience
 *
 */
@BotCommand
@CommandPkg(label="Get GUID Variant", name="get GUID variant", description="Get GUID Variant", icon="pkg.svg",
		node_label="Get GUID Variant",
		return_type=STRING, return_label="Assign the output to variable", return_required=true)

public class GetGUIDVariant {

	private static final Messages MESSAGES = MessagesFactory.getMessages("com.automationanywhere.botcommand.demo.messages");

	@Execute
	public Value<String> action(
			@Idx(index = "1", type = AttributeType.TEXT) @Pkg(label = "GUID", default_value_type = STRING) @NotEmpty String guid
			)
	{

		UUID uuid = UUID.fromString(guid);
		String v = String.valueOf(uuid.variant());

		return new StringValue(v);

	}


}
