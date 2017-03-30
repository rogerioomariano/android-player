package com.cube.lush.player.api.interceptors.channels;

import android.content.Context;
import android.support.annotation.NonNull;

import com.cube.lush.player.api.interceptors.base.BaseChannelsMockInterceptor;

/**
 * Created by Jamie Cruwys of 3 SIDED CUBE on 30/03/2017.
 */
public class MockCosmeticsChannelInterceptor extends BaseChannelsMockInterceptor
{
	public MockCosmeticsChannelInterceptor(@NonNull Context context)
	{
		super(context);
	}

	@Override protected String provideJsonFileName()
	{
		return "mock/api/channels/cosmetics.json";
	}

	@Override protected String provideChannelName()
	{
		return "cosmetics";
	}
}