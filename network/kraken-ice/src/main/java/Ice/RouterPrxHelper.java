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
// Generated from file `Router.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The Ice router interface. Routers can be set either globally with
 * {@link Communicator.setDefaultRouter}, or with <tt>ice_router</tt> on specific
 * proxies.
 * 
 **/
public final class RouterPrxHelper extends Ice.ObjectPrxHelperBase implements RouterPrx
{
    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param proxies The proxies to add.
     * 
     * @return Proxies discarded by the router.
     * 
     **/
    public Ice.ObjectPrx[]
    addProxies(Ice.ObjectPrx[] proxies)
    {
        return addProxies(proxies, null, false);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param proxies The proxies to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @return Proxies discarded by the router.
     * 
     **/
    public Ice.ObjectPrx[]
    addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx)
    {
        return addProxies(proxies, __ctx, true);
    }

    private Ice.ObjectPrx[]
    addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("addProxies");
                __delBase = __getDelegate(false);
                _RouterDel __del = (_RouterDel)__delBase;
                return __del.addProxies(proxies, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __addProxies_name = "addProxies";

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies)
    {
        return begin_addProxies(proxies, null, false, null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx)
    {
        return begin_addProxies(proxies, __ctx, true, null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, Ice.Callback __cb)
    {
        return begin_addProxies(proxies, null, false, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_addProxies(proxies, __ctx, true, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, Callback_Router_addProxies __cb)
    {
        return begin_addProxies(proxies, null, false, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx, Callback_Router_addProxies __cb)
    {
        return begin_addProxies(proxies, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_addProxies(Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__addProxies_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __addProxies_name, __cb);
        try
        {
            __result.__prepare(__addProxies_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            ObjectProxySeqHelper.write(__os, proxies);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) Proxies discarded by the router.
     * 
     **/
    public Ice.ObjectPrx[] end_addProxies(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __addProxies_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        Ice.ObjectPrx[] __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = ObjectProxySeqHelper.read(__is);
        __is.endReadEncaps();
        return __ret;
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     **/
    public boolean
    addProxies_async(AMI_Router_addProxies __cb, Ice.ObjectPrx[] proxies)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__addProxies_name);
            __r = begin_addProxies(proxies, null, false, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __addProxies_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * @param __cb The callback object for the operation.
     * @param proxies The proxies to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean
    addProxies_async(AMI_Router_addProxies __cb, Ice.ObjectPrx[] proxies, java.util.Map<String, String> __ctx)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__addProxies_name);
            __r = begin_addProxies(proxies, __ctx, true, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __addProxies_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param proxy The proxy to add.
     * 
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public void
    addProxy(Ice.ObjectPrx proxy)
    {
        addProxy(proxy, null, false);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param proxy The proxy to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public void
    addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
    {
        addProxy(proxy, __ctx, true);
    }

    private void
    addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _RouterDel __del = (_RouterDel)__delBase;
                __del.addProxy(proxy, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __addProxy_name = "addProxy";

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy)
    {
        return begin_addProxy(proxy, null, false, null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
    {
        return begin_addProxy(proxy, __ctx, true, null);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, Ice.Callback __cb)
    {
        return begin_addProxy(proxy, null, false, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_addProxy(proxy, __ctx, true, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, Callback_Router_addProxy __cb)
    {
        return begin_addProxy(proxy, null, false, __cb);
    }

    /**
     * Add new proxy information to the router's routing table.
     * 
     * <p class="Deprecated">This operation is deprecated, and only used for old
     * Ice clients (older than version 3.1).
     * 
     * @param __cb The callback object for the operation.
     * @param proxy The proxy to add.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @deprecated addProxy() is deprecated, use addProxies() instead.
     **/
    public Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, Callback_Router_addProxy __cb)
    {
        return begin_addProxy(proxy, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_addProxy(Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __addProxy_name, __cb);
        try
        {
            __result.__prepare(__addProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeProxy(proxy);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_addProxy(Ice.AsyncResult __result)
    {
        __end(__result, __addProxy_name);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @return The router's client proxy.
     * 
     **/
    public Ice.ObjectPrx
    getClientProxy()
    {
        return getClientProxy(null, false);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @return The router's client proxy.
     * 
     **/
    public Ice.ObjectPrx
    getClientProxy(java.util.Map<String, String> __ctx)
    {
        return getClientProxy(__ctx, true);
    }

    private Ice.ObjectPrx
    getClientProxy(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getClientProxy");
                __delBase = __getDelegate(false);
                _RouterDel __del = (_RouterDel)__delBase;
                return __del.getClientProxy(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __getClientProxy_name = "getClientProxy";

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getClientProxy()
    {
        return begin_getClientProxy(null, false, null);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getClientProxy(java.util.Map<String, String> __ctx)
    {
        return begin_getClientProxy(__ctx, true, null);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getClientProxy(Ice.Callback __cb)
    {
        return begin_getClientProxy(null, false, __cb);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getClientProxy(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getClientProxy(__ctx, true, __cb);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getClientProxy(Callback_Router_getClientProxy __cb)
    {
        return begin_getClientProxy(null, false, __cb);
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getClientProxy(java.util.Map<String, String> __ctx, Callback_Router_getClientProxy __cb)
    {
        return begin_getClientProxy(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getClientProxy(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getClientProxy_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getClientProxy_name, __cb);
        try
        {
            __result.__prepare(__getClientProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) The router's client proxy.
     * 
     **/
    public Ice.ObjectPrx end_getClientProxy(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getClientProxy_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        Ice.ObjectPrx __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readProxy();
        __is.endReadEncaps();
        return __ret;
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public boolean
    getClientProxy_async(AMI_Router_getClientProxy __cb)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__getClientProxy_name);
            __r = begin_getClientProxy(null, false, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __getClientProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Get the router's client proxy, i.e., the proxy to use for
     * forwarding requests from the client to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean
    getClientProxy_async(AMI_Router_getClientProxy __cb, java.util.Map<String, String> __ctx)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__getClientProxy_name);
            __r = begin_getClientProxy(__ctx, true, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __getClientProxy_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @return The router's server proxy.
     * 
     **/
    public Ice.ObjectPrx
    getServerProxy()
    {
        return getServerProxy(null, false);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @return The router's server proxy.
     * 
     **/
    public Ice.ObjectPrx
    getServerProxy(java.util.Map<String, String> __ctx)
    {
        return getServerProxy(__ctx, true);
    }

    private Ice.ObjectPrx
    getServerProxy(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getServerProxy");
                __delBase = __getDelegate(false);
                _RouterDel __del = (_RouterDel)__delBase;
                return __del.getServerProxy(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __getServerProxy_name = "getServerProxy";

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getServerProxy()
    {
        return begin_getServerProxy(null, false, null);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getServerProxy(java.util.Map<String, String> __ctx)
    {
        return begin_getServerProxy(__ctx, true, null);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getServerProxy(Ice.Callback __cb)
    {
        return begin_getServerProxy(null, false, __cb);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getServerProxy(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getServerProxy(__ctx, true, __cb);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getServerProxy(Callback_Router_getServerProxy __cb)
    {
        return begin_getServerProxy(null, false, __cb);
    }

    /**
     * Get the router's server proxy, i.e., the proxy to use for
     * forwarding requests from the server to the router.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getServerProxy(java.util.Map<String, String> __ctx, Callback_Router_getServerProxy __cb)
    {
        return begin_getServerProxy(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getServerProxy(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getServerProxy_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getServerProxy_name, __cb);
        try
        {
            __result.__prepare(__getServerProxy_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) The router's server proxy.
     * 
     **/
    public Ice.ObjectPrx end_getServerProxy(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getServerProxy_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        Ice.ObjectPrx __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readProxy();
        __is.endReadEncaps();
        return __ret;
    }

    public static RouterPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (RouterPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Ice::Router"))
                {
                    RouterPrxHelper __h = new RouterPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static RouterPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (RouterPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Ice::Router", __ctx))
                {
                    RouterPrxHelper __h = new RouterPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static RouterPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Ice::Router"))
                {
                    RouterPrxHelper __h = new RouterPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static RouterPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Ice::Router", __ctx))
                {
                    RouterPrxHelper __h = new RouterPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static RouterPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (RouterPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                RouterPrxHelper __h = new RouterPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static RouterPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        RouterPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            RouterPrxHelper __h = new RouterPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _RouterDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _RouterDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, RouterPrx v)
    {
        __os.writeProxy(v);
    }

    public static RouterPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            RouterPrxHelper result = new RouterPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}