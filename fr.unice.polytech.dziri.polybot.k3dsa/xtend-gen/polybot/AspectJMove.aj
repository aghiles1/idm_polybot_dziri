// AspectJ classes that have been aspectized and name
package polybot;
public aspect AspectJMove{
void around (polybot.Move self)  :target (self) && (call ( void polybot.Move.exec( int,int ) ) ) { Polybot.polybot.aspects.MoveAspect.exec(self,(int)thisJoinPoint.getArgs()[0],(int)thisJoinPoint.getArgs()[1] );}

}
