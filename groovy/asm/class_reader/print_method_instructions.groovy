@Grab('org.ow2.asm:asm:5.0.2')
@Grab('org.ow2.asm:asm-tree:5.0.2')
import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode

def reader = new ClassReader(new File(args[0]).newInputStream())
def node = new ClassNode()

reader.accept node, ClassReader.SKIP_DEBUG

node.methods.each {
	println "----- ${it.name} -----"

	it.instructions.each {
		println it
	}
}
