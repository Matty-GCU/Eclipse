package part01;

public class EncryptAndDecrypt {
	String encrypt(String sourceString, String password) {
		char[] p = password.toCharArray();
		char[] s = sourceString.toCharArray();
		for(int i=0; i<s.length; i++) {
			int cypher = s[i] + p[i%p.length];
			s[i] = (char)cypher;
		}
		return new String(s);
	}
	String decrypt(String sourceString, String password) {
		char[] p = password.toCharArray();
		char[] s = sourceString.toCharArray();
		for(int i=0; i<s.length; i++) {
			int cypher = s[i] - p[i%p.length];
			s[i] = (char)cypher;
		}
		return new String(s);
	}
}
