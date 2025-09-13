package com.company.openclose;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

	// Open for modification
	@Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * getBaseRate() / 100;
    }
}
