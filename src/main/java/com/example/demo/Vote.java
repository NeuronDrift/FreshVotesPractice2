package com.example.demo;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote
{

    @EmbeddedId
    private VoteId pk;


    private boolean upvote;

    public boolean isUpvote()
    {

        return upvote;

    }

    public void setUpvote(boolean upvote)
    {

        this.upvote = upvote;

    }
}
