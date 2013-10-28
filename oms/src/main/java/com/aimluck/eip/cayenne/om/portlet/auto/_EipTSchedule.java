package com.aimluck.eip.cayenne.om.portlet.auto;

import java.util.List;

/** Class _EipTSchedule was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTSchedule extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String EDIT_FLAG_PROPERTY = "editFlag";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String MAIL_FLAG_PROPERTY = "mailFlag";
    public static final String NAME_PROPERTY = "name";
    public static final String NOTE_PROPERTY = "note";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String PLACE_PROPERTY = "place";
    public static final String PUBLIC_FLAG_PROPERTY = "publicFlag";
    public static final String REPEAT_PATTERN_PROPERTY = "repeatPattern";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String UPDATE_USER_ID_PROPERTY = "updateUserId";
    public static final String EIP_TSCHEDULE_MAPS_PROPERTY = "eipTScheduleMaps";

    public static final String SCHEDULE_ID_PK_COLUMN = "SCHEDULE_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setEditFlag(String editFlag) {
        writeProperty("editFlag", editFlag);
    }
    public String getEditFlag() {
        return (String)readProperty("editFlag");
    }
    
    
    public void setEndDate(java.util.Date endDate) {
        writeProperty("endDate", endDate);
    }
    public java.util.Date getEndDate() {
        return (java.util.Date)readProperty("endDate");
    }
    
    
    public void setMailFlag(String mailFlag) {
        writeProperty("mailFlag", mailFlag);
    }
    public String getMailFlag() {
        return (String)readProperty("mailFlag");
    }
    
    
    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setParentId(Integer parentId) {
        writeProperty("parentId", parentId);
    }
    public Integer getParentId() {
        return (Integer)readProperty("parentId");
    }
    
    
    public void setPlace(String place) {
        writeProperty("place", place);
    }
    public String getPlace() {
        return (String)readProperty("place");
    }
    
    
    public void setPublicFlag(String publicFlag) {
        writeProperty("publicFlag", publicFlag);
    }
    public String getPublicFlag() {
        return (String)readProperty("publicFlag");
    }
    
    
    public void setRepeatPattern(String repeatPattern) {
        writeProperty("repeatPattern", repeatPattern);
    }
    public String getRepeatPattern() {
        return (String)readProperty("repeatPattern");
    }
    
    
    public void setStartDate(java.util.Date startDate) {
        writeProperty("startDate", startDate);
    }
    public java.util.Date getStartDate() {
        return (java.util.Date)readProperty("startDate");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUpdateUserId(Integer updateUserId) {
        writeProperty("updateUserId", updateUserId);
    }
    public Integer getUpdateUserId() {
        return (Integer)readProperty("updateUserId");
    }
    
    
    public void addToEipTScheduleMaps(com.aimluck.eip.cayenne.om.portlet.EipTScheduleMap obj) {
        addToManyTarget("eipTScheduleMaps", obj, true);
    }
    public void removeFromEipTScheduleMaps(com.aimluck.eip.cayenne.om.portlet.EipTScheduleMap obj) {
        removeToManyTarget("eipTScheduleMaps", obj, true);
    }
    public List getEipTScheduleMaps() {
        return (List)readProperty("eipTScheduleMaps");
    }
    
    
}