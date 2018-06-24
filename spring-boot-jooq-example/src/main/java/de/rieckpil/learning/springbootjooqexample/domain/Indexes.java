/*
 * This file is generated by jOOQ.
*/
package de.rieckpil.learning.springbootjooqexample.domain;


import de.rieckpil.learning.springbootjooqexample.domain.tables.Comments;
import de.rieckpil.learning.springbootjooqexample.domain.tables.Posts;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index COMMENTS_PKEY = Indexes0.COMMENTS_PKEY;
    public static final Index POSTS_PKEY = Indexes0.POSTS_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COMMENTS_PKEY = Internal.createIndex("comments_pkey", Comments.COMMENTS, new OrderField[] { Comments.COMMENTS.ID }, true);
        public static Index POSTS_PKEY = Internal.createIndex("posts_pkey", Posts.POSTS, new OrderField[] { Posts.POSTS.ID }, true);
    }
}
