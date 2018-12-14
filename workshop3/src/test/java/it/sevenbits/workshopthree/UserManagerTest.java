package it.sevenbits.workshopthree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class UserManagerTest {
    private UserManager userManager;
    private ICollection collection;


    @Before
    public void setUp(){
        collection = mock(ICollection.class);
        userManager = new UserManager(collection);

    }
    @Test
    public void GetUserByIndexTest() throws IOException, UserManagerException {
        User user = new User("Alex","Admin");
        when(collection.get(0)).thenReturn(user);
        assertEquals("Wrong result", user, userManager.getUserByIndex(0));
        assertEquals("Wrong result", "Alex",userManager.getUserByIndex(0).getName());
        assertEquals("Wrong result", "Admin",userManager.getUserByIndex(0).getRole());
    }

    @Test
    public void createDefaultTest() throws UserManagerException, IOException {
        doAnswer(new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                Object[] arguments = invocation.getArguments();
                User user = (User) arguments[0];
                assertEquals("Vasek", user.getName());
                assertEquals("default", user.getRole());
                return null;
            }
        }).when(collection).add(any(User.class));
        userManager.createDefault("Vasek");
    }
    @Test(expected = UserManagerException.class )
    public void getExceptionTest() throws IOException, UserManagerException {
        doThrow(new IOException()).when(collection).get(2);
        userManager.getUserByIndex(2);
    }
    @Test(expected = UserManagerException.class)
    public void setExceptionTest() throws UserManagerException, IOException {
        doThrow(new IOException()).when(collection).add(any(User.class));
        userManager.createDefault("null");
    }

}
