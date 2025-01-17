/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.integrations.destination_async;

import io.airbyte.commons.concurrency.VoidCallable;

/**
 * Async version of
 * {@link io.airbyte.cdk.integrations.destination.buffered_stream_consumer.OnCloseFunction}.
 * Separately out for easier versioning.
 */
public interface OnCloseFunction extends VoidCallable {}
