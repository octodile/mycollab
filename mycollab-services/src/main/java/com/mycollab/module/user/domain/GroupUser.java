/*Domain class of table m_group_user*/
package com.mycollab.module.user.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_group_user")
@Alias("GroupUser")
public class GroupUser extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_group_user.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_group_user.groupId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("groupId")
    private Integer groupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_group_user.user
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Length(max=45, message="Field value is too long")
    @Column("user")
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_group_user.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_group_user.isOwner
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    @Column("isOwner")
    private Boolean isowner;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        GroupUser item = (GroupUser)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(201, 469).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_group_user.id
     *
     * @return the value of m_group_user.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_group_user.id
     *
     * @param id the value for m_group_user.id
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_group_user.groupId
     *
     * @return the value of m_group_user.groupId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_group_user.groupId
     *
     * @param groupid the value for m_group_user.groupId
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_group_user.user
     *
     * @return the value of m_group_user.user
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_group_user.user
     *
     * @param user the value for m_group_user.user
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_group_user.createdTime
     *
     * @return the value of m_group_user.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_group_user.createdTime
     *
     * @param createdtime the value for m_group_user.createdTime
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_group_user.isOwner
     *
     * @return the value of m_group_user.isOwner
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public Boolean getIsowner() {
        return isowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_group_user.isOwner
     *
     * @param isowner the value for m_group_user.isOwner
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    public void setIsowner(Boolean isowner) {
        this.isowner = isowner;
    }

    public enum Field {
        id,
        groupid,
        user,
        createdtime,
        isowner;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}