package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The base class for all kinds of signature requests.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public abstract class SignatureRequest extends BaseDto {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1000127674564831038L;

	/** The email blurb. */
    @JsonProperty("emailBlurb")
    private String emailBlurb;

    /** The email subject. */
    @JsonProperty("emailSubject")
    private String emailSubject;

    /** The status. */
    @JsonProperty("status")
    private Status status;

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
     * Gets the status.
     * 
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

}
