
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.savara.policyquote.drivingrecordservice;

import java.util.logging.Logger;

import com.dmv.drivingrecord.DrivingRecordResponse;

@org.switchyard.component.bean.Service(DrivingRecordService.class)
public class DrivingRecordServiceImpl implements DrivingRecordService {

    private static final Logger LOG = Logger.getLogger(DrivingRecordServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.savara.policyquote.drivingrecordservice.DrivingRecordService#drivingRecord(com.dmv.drivingrecord.DrivingRecordRequest  content )*
     */
    public com.dmv.drivingrecord.DrivingRecordResponse drivingRecord(com.dmv.drivingrecord.DrivingRecordRequest content) {

        LOG.info("drivingRecord() content = "+content+" : if ssn = 555555555 introduce delay");        
        
        DrivingRecordResponse ret=new DrivingRecordResponse();
        ret.setAge(content.getAge());
        ret.setDlNumber(content.getDlNumber());
        ret.setName(content.getName());
        if ("666666666".equals(content.getSsn())) {
            ret.setNumberOfAccidents(6);
        } else  {
            ret.setNumberOfAccidents(0);
        }
        ret.setNumberOfTickets(1);
        ret.setSsn(content.getSsn());
        if ("555555555".equals(ret.getSsn())) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignore) {}
        }
        return (ret);
    }

}
