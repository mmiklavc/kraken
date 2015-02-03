// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `LocalException.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * This exception is raised if the type of an unmarshaled Slice class instance does
 * not match its expected type.
 * This can happen if client and server are compiled with mismatched Slice
 * definitions or if a class of the wrong type is passed as a parameter
 * or return value using dynamic invocation. This exception can also be
 * raised if {@link IceStorm} is used to send Slice class instances and
 * an operation is subscribed to the wrong topic.
 * 
 **/
public class UnexpectedObjectException extends MarshalException
{
    public UnexpectedObjectException()
    {
        super();
    }

    public UnexpectedObjectException(String reason, String type, String expectedType)
    {
        super(reason);
        this.type = type;
        this.expectedType = expectedType;
    }

    public String
    ice_name()
    {
        return "Ice::UnexpectedObjectException";
    }

    /**
     * The Slice type ID of the class instance that was unmarshaled.
     * 
     **/
    public String type;

    /**
     * The Slice type ID that was expected by the receiving operation.
     * 
     **/
    public String expectedType;
}