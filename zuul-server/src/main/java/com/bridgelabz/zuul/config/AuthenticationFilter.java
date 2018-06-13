package com.bridgelabz.zuul.config;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class AuthenticationFilter extends ZuulFilter {

	private static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJGb28iXSwiZXhwIjoxNTI4NzQ2NzMxLCJhdXRob3JpdGllcyI6WyJmb29fcmVhZCIsImZvb193cml0ZSJdLCJqdGkiOiI5ZjRhMWIzMS0wYmFmLTQ3OGUtYTFkMC0xMGNiNDNlNjVmNTciLCJjbGllbnRfaWQiOiJjbGllbnQtaWQifQ.qNY3m-Q7UnlYqUySbzoh2mGd1YHydoZzFmLjN4ganlk";

	@Override
	public Object run() throws ZuulException {
		RequestContext context = RequestContext.getCurrentContext();
		context.addZuulRequestHeader("Authorization", TOKEN);
		context.getRequest().getParameterMap().put("test-key", new String[] { "test-value" });

		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
