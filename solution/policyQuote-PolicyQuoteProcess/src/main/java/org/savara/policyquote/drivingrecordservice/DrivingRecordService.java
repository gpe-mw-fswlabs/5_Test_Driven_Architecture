package org.savara.policyquote.drivingrecordservice;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-01-16T11:50:35.130+05:30
 * Generated source version: 2.7.0
 * 
 */
@XmlSeeAlso({com.dmv.drivingrecord.ObjectFactory.class})
public interface DrivingRecordService {

    public com.dmv.drivingrecord.DrivingRecordResponse drivingRecord(
        com.dmv.drivingrecord.DrivingRecordRequest content
    );
}
