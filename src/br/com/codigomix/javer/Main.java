package br.com.codigomix.javer;

<<<<<<< HEAD
import java.nio.file.Path;

=======
>>>>>>> e6553b88cdd330a8146293b5fc8456728a224d2b
public class Main {

	public static void main(String[] args) {

<<<<<<< HEAD
		if (args.length == 0) {
			System.out.println("Favor informar a classe, biblioteca ou diretorio");
			System.exit(1);
		}

		Path cmdLinePath = Path.of(args[0]);

		JaverComponent jc = null;

		if (JaverComponents.isJaverClassFile(cmdLinePath)) {
			jc = JaverClassFile.of(cmdLinePath);

		} else if (JaverComponents.isJaverDirectory(cmdLinePath)) {
			jc = JaverJarFile.of(cmdLinePath);

		} else if (JaverComponents.isJaverJarFile(cmdLinePath)) {
			jc = JaverJarFile.of(cmdLinePath);

		} else {
			System.out.println("Invalid path");
			System.exit(1);
		}

		jc.printVersion();

=======
		switch (args[0]) {
		case "-v":
			JavaFile.of(args[1]).printVersion();
			break;

		case "-anotherUsefulUsageForThisProgram":
			break;
		
		default:
			System.out.println("Invalid option");
		}
>>>>>>> e6553b88cdd330a8146293b5fc8456728a224d2b
	}
}
