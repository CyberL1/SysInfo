import static java.lang.System.out;
import static java.lang.System.getProperty;

public class SysInfo {

	public static void main(String[] args) {
		out.println("=====================");
		out.println("| Info about system |");
		out.println("=====================");
		out.println("System :: " + getProperty("os.name"));
		out.println("Architecture :: " + getProperty("os.arch"));
		out.println("System version :: " + getProperty("os.version"));
		out.println("Current working user :: " + getProperty("user.name"));
		out.println("User home directory :: " + getProperty("user.home"));
		out.println("Current working directory :: " + getProperty("user.dir"));
		out.println("Patch separator :: " + getProperty("path.separator"));
		out.println("File separator :: " + getProperty("file.separator"));
		out.println("Java version :: " + getProperty("java.runtime.version"));
		out.println("Java compiler :: " + getProperty("java.compiler", "You don't have one"));
		out.println("Java Class path :: " + getProperty("java.class.path"));
		out.println("Java VM  :: " + getProperty("java.vm.name"));
		out.println("Java VM version :: " + getProperty("java.vm.version"));
		out.println("Java home directory :: " + getProperty("java.home"));
	}
}