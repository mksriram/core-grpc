package com.service.greeting;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import com.service.greeting.delegate.IServiceDelegate;

@Component(immediate = true, service = GreetingService.class)
public class GreetingService implements IService {

    IServiceDelegate greetingServiceDelegate;
    public String getGreeting() {
	return null;
    }

    @Reference
    public void setGreetingService(IServiceDelegate delegate)
    {
	greetingServiceDelegate = delegate;
    }
}
