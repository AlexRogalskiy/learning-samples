/*
 * This file is generated by jOOQ.
*/
package de.rieckpil.learning.springbootjooqexample.domain;


import de.rieckpil.learning.springbootjooqexample.domain.tables.Comments;
import de.rieckpil.learning.springbootjooqexample.domain.tables.Posts;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.comments</code>.
     */
    public static final Comments COMMENTS = de.rieckpil.learning.springbootjooqexample.domain.tables.Comments.COMMENTS;

    /**
     * The table <code>public.posts</code>.
     */
    public static final Posts POSTS = de.rieckpil.learning.springbootjooqexample.domain.tables.Posts.POSTS;
}