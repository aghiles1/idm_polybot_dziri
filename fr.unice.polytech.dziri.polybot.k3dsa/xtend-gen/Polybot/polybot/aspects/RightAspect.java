package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspect;
import Polybot.polybot.aspects.MoveAspect;
import Polybot.polybot.aspects.RightAspectRightAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.Right;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends MoveAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final Right _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.RightAspectRightAspectProperties _self_ = Polybot.polybot.aspects.RightAspectRightAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.Right){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.RightAspect._privk3_exec(_self_, (polybot.Right)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "Right", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final RightAspectRightAspectProperties _self_, final Right _self, final int speed, final int duration) {
    InputOutput.<String>println("Right");
    BotAspect.rob.turnRight(speed);
    for (int i = 0; (i < duration); i = (i + 50)) {
      BotAspect.rob.synchronousTrigger();
    }
    BotAspect.rob.turnRight(0);
  }
}
