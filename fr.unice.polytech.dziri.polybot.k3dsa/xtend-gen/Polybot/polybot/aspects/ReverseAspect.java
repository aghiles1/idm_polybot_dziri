package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspect;
import Polybot.polybot.aspects.MoveAspect;
import Polybot.polybot.aspects.ReverseAspectReverseAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.Reverse;

@Aspect(className = Reverse.class)
@SuppressWarnings("all")
public class ReverseAspect extends MoveAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final Reverse _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.ReverseAspectReverseAspectProperties _self_ = Polybot.polybot.aspects.ReverseAspectReverseAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.Reverse){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.ReverseAspect._privk3_exec(_self_, (polybot.Reverse)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "Reverse", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final ReverseAspectReverseAspectProperties _self_, final Reverse _self, final int speed, final int duration) {
    InputOutput.<String>println("Reverse");
    BotAspect.rob.goStraight((-speed));
    for (int i = 0; (i < duration); i = (i + 50)) {
      BotAspect.rob.synchronousTrigger();
    }
    BotAspect.rob.goStraight(0);
  }
}
