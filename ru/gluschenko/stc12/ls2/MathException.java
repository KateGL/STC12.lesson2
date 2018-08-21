package ru.gluschenko.stc12.ls2;


/***
 * Класс для исключения
 */
public class MathException extends Exception{


    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public MathException(String message) {
        super(message);
    }

    /***
     * перегружаем метод для сообщения
     * @return
     */
    public String toString(){
        String message = super.toString();
        return "Message from MathException:"+message;
    }

    /**
     * Returns the detail message string of this throwable.
     *
     * @return  the detail message string of this {@code Throwable} instance
     *          (which may be {@code null}).
     */
    public String getMessage() {
        String message = super.getMessage();
        return "Message from MathException:"+message;
    }
}
