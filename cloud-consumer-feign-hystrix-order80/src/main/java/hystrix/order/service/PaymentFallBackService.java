package hystrix.order.service;

import org.springframework.stereotype.Component;

/*重新实现一个类用于fallback方法*/
@Component
public class PaymentFallBackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
