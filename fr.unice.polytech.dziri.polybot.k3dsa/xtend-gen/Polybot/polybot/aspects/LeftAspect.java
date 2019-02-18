package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspect;
import Polybot.polybot.aspects.LeftAspectLeftAspectProperties;
import Polybot.polybot.aspects.MoveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.Left;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends MoveAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final Left _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.LeftAspectLeftAspectProperties _self_ = Polybot.polybot.aspects.LeftAspectLeftAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.Left){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.LeftAspect._privk3_exec(_self_, (polybot.Left)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "Left", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final LeftAspectLeftAspectProperties _self_, final Left _self, final int speed, final int duration) {
    InputOutput.<String>println("left");
    BotAspect.rob.turnLeft(speed);
    for (int i = 0; (i < duration); i = (i + 50)) {
      BotAspect.rob.synchronousTrigger();
    }
    BotAspect.rob.turnLeft(0);
  }
}
