// AspectJ classes that have been aspectized and name
package polybot;
public aspect AspectJInstruction{
void around (polybot.Instruction self)  :target (self) && (call ( void polybot.Instruction.exec(  ) ) ) { Polybot.polybot.aspects.InstructionAspect.exec(self );}

}
