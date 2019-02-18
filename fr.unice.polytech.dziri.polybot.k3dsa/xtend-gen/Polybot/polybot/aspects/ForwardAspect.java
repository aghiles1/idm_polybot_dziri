package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspect;
import Polybot.polybot.aspects.ForwardAspectForwardAspectProperties;
import Polybot.polybot.aspects.MoveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.Forward;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends MoveAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final Forward _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.ForwardAspectForwardAspectProperties _self_ = Polybot.polybot.aspects.ForwardAspectForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.Forward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.ForwardAspect._privk3_exec(_self_, (polybot.Forward)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "Forward", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final ForwardAspectForwardAspectProperties _self_, final Forward _self, final int speed, final int duration) {
    InputOutput.<String>println("Forward");
    BotAspect.rob.goStraight(speed);
    for (int i = 0; (i < duration); i = (i + 50)) {
      BotAspect.rob.synchronousTrigger();
    }
    BotAspect.rob.goStraight(0);
  }
}
