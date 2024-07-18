package cn.felord.domain.message;

/**
 * The interface Message body builder.
 *
 * @author dax
 * @since 2024 /4/29
 */
public interface MessageBodyBuilder {
    /**
     * Touser message body builder.
     *
     * @param touser the touser
     * @return the message body builder
     */
    MessageBodyBuilder touser(String touser);

    /**
     * Touser string.
     *
     * @return the string
     */
    String touser();

    /**
     * Toparty message body builder.
     *
     * @param toparty the toparty
     * @return the message body builder
     */
    MessageBodyBuilder toparty(String toparty);

    /**
     * Toparty string.
     *
     * @return the string
     */
    String toparty();

    /**
     * Totag message body builder.
     *
     * @param totag the totag
     * @return the message body builder
     */
    MessageBodyBuilder totag(String totag);

    /**
     * Totag string.
     *
     * @return the string
     */
    String totag();

    /**
     * Build abstract message body.
     *
     * @return the abstract message body
     */
    AbstractMessageBody build();
}
