package com.ssmweb.videoAlarm.pojo;

import java.util.Date;

public class EpcpVideoAlarm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epcp_video_alarm.ID
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epcp_video_alarm.ALARM_TIME
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    private Date alarmTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epcp_video_alarm.ALARM_TYPE
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    private String alarmType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epcp_video_alarm.DEVICE_IP
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    private String deviceIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epcp_video_alarm.CHANNEL_NO
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    private Integer channelNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epcp_video_alarm.ID
     *
     * @return the value of epcp_video_alarm.ID
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epcp_video_alarm.ID
     *
     * @param id the value for epcp_video_alarm.ID
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epcp_video_alarm.ALARM_TIME
     *
     * @return the value of epcp_video_alarm.ALARM_TIME
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public Date getAlarmTime() {
        return alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epcp_video_alarm.ALARM_TIME
     *
     * @param alarmTime the value for epcp_video_alarm.ALARM_TIME
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epcp_video_alarm.ALARM_TYPE
     *
     * @return the value of epcp_video_alarm.ALARM_TYPE
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epcp_video_alarm.ALARM_TYPE
     *
     * @param alarmType the value for epcp_video_alarm.ALARM_TYPE
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epcp_video_alarm.DEVICE_IP
     *
     * @return the value of epcp_video_alarm.DEVICE_IP
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public String getDeviceIp() {
        return deviceIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epcp_video_alarm.DEVICE_IP
     *
     * @param deviceIp the value for epcp_video_alarm.DEVICE_IP
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp == null ? null : deviceIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epcp_video_alarm.CHANNEL_NO
     *
     * @return the value of epcp_video_alarm.CHANNEL_NO
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public Integer getChannelNo() {
        return channelNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epcp_video_alarm.CHANNEL_NO
     *
     * @param channelNo the value for epcp_video_alarm.CHANNEL_NO
     *
     * @mbggenerated Thu Sep 21 16:31:56 CST 2017
     */
    public void setChannelNo(Integer channelNo) {
        this.channelNo = channelNo;
    }
}