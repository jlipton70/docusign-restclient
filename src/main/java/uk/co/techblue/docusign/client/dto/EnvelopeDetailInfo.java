package uk.co.techblue.docusign.client.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

/**
 * The Class EnvelopeDetailInfo.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeDetailInfo extends EnvelopeInfo {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The allow reassign. */
    @JsonProperty
    private Boolean allowReassign;

    /** The email blurb. */
    @JsonProperty
    private String emailBlurb;

    /** The email subject. */
    @JsonProperty
    private String emailSubject;

    /** The enable wet sign. */
    @JsonProperty
    private Boolean enableWetSign;

    /** The created date time. */
    @JsonProperty
    private Date createdDateTime;

    @JsonProperty
    private Date completedDateTime;

    @JsonProperty
    private Date deliveredDateTime;

    @JsonProperty
    private Date sentDateTime;

    /**
     * Gets the allow reassign.
     * 
     * @return the allow reassign
     */
    public Boolean getAllowReassign() {
        return allowReassign;
    }

    /**
     * Sets the allow reassign.
     * 
     * @param allowReassign
     *            the new allow reassign
     */
    public void setAllowReassign(Boolean allowReassign) {
        this.allowReassign = allowReassign;
    }

    /**
     * Gets the email blurb.
     * 
     * @return the email blurb
     */
    public String getEmailBlurb() {
        return emailBlurb;
    }

    /**
     * Sets the email blurb.
     * 
     * @param emailBlurb
     *            the new email blurb
     */
    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    /**
     * Gets the email subject.
     * 
     * @return the email subject
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the email subject.
     * 
     * @param emailSubject
     *            the new email subject
     */
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * Gets the enable wet sign.
     * 
     * @return the enable wet sign
     */
    public Boolean getEnableWetSign() {
        return enableWetSign;
    }

    /**
     * Sets the enable wet sign.
     * 
     * @param enableWetSign
     *            the new enable wet sign
     */
    public void setEnableWetSign(Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
    }

    /**
     * Gets the created date time.
     * 
     * @return the created date time
     */
    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the created date time.
     * 
     * @param createdDateTime
     *            the new created date time
     */
    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * Gets the completed date time.
     * 
     * @return the completed date time
     */
    public Date getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the completed date time.
     * 
     * @param completedDateTime
     *            the new completed date time
     */
    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setCompletedDateTime(Date completedDateTime) {
        this.completedDateTime = completedDateTime;
    }

    /**
     * Gets the delivered date time.
     * 
     * @return the delivered date time
     */
    public Date getDeliveredDateTime() {
        return deliveredDateTime;
    }

    /**
     * Sets the delivered date time.
     * 
     * @param deliveredDateTime
     *            the new delivered date time
     */
    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setDeliveredDateTime(Date deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }

    /**
     * Gets the sent date time.
     * 
     * @return the sent date time
     */
    public Date getSentDateTime() {
        return sentDateTime;
    }

    /**
     * Sets the sent date time.
     * 
     * @param sentDateTime
     *            the new sent date time
     */
    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setSentDateTime(Date sentDateTime) {
        this.sentDateTime = sentDateTime;
    }

}
