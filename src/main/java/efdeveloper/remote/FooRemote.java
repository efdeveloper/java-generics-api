package efdeveloper.remote;

import javax.ejb.Remote;

@Remote
public interface FooRemote {

    String JNDI_NAME = "ejb:/java-generics/FooBean!efdeveloper.remote.FooRemote";

    boolean foo();

}
