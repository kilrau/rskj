/*
 * This file is part of RskJ
 * Copyright (C) 2018 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package co.rsk.jsonrpc;

import java.util.Objects;

/**
 * This the JSON-RPC result response DTO for JSON serialization purposes.
 */
public class JsonRpcResultResponse extends JsonRpcIdentifiableMessage {
	
	private final JsonRpcResult result;

	public JsonRpcResultResponse(Object id, JsonRpcResult result) {
		super(JsonRpcVersion.V2_0, id);
		this.result = Objects.requireNonNull(result);
	}

	@SuppressWarnings("unused")
	public JsonRpcResult getResult() {
		return result;
	}
}
