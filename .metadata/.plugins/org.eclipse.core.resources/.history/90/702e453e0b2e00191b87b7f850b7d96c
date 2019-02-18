// AspectJ classes that have been aspectized and name
package polybot;
public aspect AspectJInstruction{
void around (polybot.Instruction self)  :target (self) && (call ( void polybot.Instruction.exec( int,int ) ) ) { Polybot.polybot.aspects.InstructionAspect.exec(self,(int)thisJoinPoint.getArgs()[0],(int)thisJoinPoint.getArgs()[1] );}

}
