package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.SupportedLanguage;

/**
 * The Class RecipientEmailNotification.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class RecipientEmailNotification extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1202148581038428107L;

	/** The subject. */
	@JsonProperty("subject")
	private String subject;

	/** The email blurb. */
	@JsonProperty("emailBlurb")
	private String emailBlurb;

	/** The language. */
	@JsonProperty("language")
	private SupportedLanguage language;

	/**
	 * Gets the subject.
	 * 
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 * 
	 * @param subject
	 *            the new subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
	 * Gets the language.
	 * 
	 * @return the language
	 */
	public SupportedLanguage getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 * 
	 * @param language
	 *            the new language
	 */
	public void setLanguage(SupportedLanguage language) {
		this.language = language;
	}
}
