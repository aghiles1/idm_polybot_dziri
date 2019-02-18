package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspect;
import Polybot.polybot.aspects.GoToAspectGoToAspectProperties;
import Polybot.polybot.aspects.MoveAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import polybot.GoTo;

@Aspect(className = GoTo.class)
@SuppressWarnings("all")
public class GoToAspect extends MoveAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final GoTo _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.GoToAspectGoToAspectProperties _self_ = Polybot.polybot.aspects.GoToAspectGoToAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.GoTo){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.GoToAspect._privk3_exec(_self_, (polybot.GoTo)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "GoTo", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_exec(final GoTo _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.MoveAspectMoveAspectProperties _self_ = Polybot.polybot.aspects.MoveAspectMoveAspectContext.getSelf(_self);
     Polybot.polybot.aspects.MoveAspect._privk3_exec(_self_, _self,speed,duration);
  }
  
  protected static void _privk3_exec(final GoToAspectGoToAspectProperties _self_, final GoTo _self, final int speed, final int duration) {
    BotAspect.rob.goToSafePlace(BotAspect.rob.getPosition(), BotAspect.rob.getOrientation());
  }
}
