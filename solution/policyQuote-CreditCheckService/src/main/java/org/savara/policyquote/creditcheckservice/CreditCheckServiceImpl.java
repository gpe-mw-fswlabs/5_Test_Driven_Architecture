
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.savara.policyquote.creditcheckservice;

import com.creditagency.creditcheck.CreditCheckRequest;
import com.creditagency.creditcheck.CreditCheckResponse;

import java.util.logging.Logger;

@org.switchyard.component.bean.Service(CreditCheckService.class)
public class CreditCheckServiceImpl implements CreditCheckService {

    private static final Logger LOG = Logger.getLogger(CreditCheckServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.savara.policyquote.creditcheckservice.CreditCheckService#creditCheck(com.creditagency.creditcheck.CreditCheckRequest  content )*
     */
    public com.creditagency.creditcheck.CreditCheckResponse creditCheck(com.creditagency.creditcheck.CreditCheckRequest content) {

        LOG.info("creditCheck() content = "+content);
        CreditCheckResponse ret=new CreditCheckResponse();

        ret.setSsn(content.getSsn());

        ret.setScore(500);
        return (ret);
    }

}
