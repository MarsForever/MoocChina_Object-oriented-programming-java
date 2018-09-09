package test;

public class Test17 {
	
	void f(int port) {
	    return new Package(port) {
	        private int pt = port;
	        public getPort() { return pt; }
	    };    
	}

}

