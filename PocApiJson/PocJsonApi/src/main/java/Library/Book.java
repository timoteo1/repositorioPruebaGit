package Library;

import com.github.jasminb.jsonapi.LongIdHandler;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

//Each resource class must have an id field.

@Type("book")
public class Book {

    @Id(LongIdHandler.class)
    private Long id;
    private String BooksName;
}
