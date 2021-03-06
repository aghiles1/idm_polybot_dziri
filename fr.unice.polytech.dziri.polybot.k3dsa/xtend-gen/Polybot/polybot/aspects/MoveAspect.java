package Polybot.polybot.aspects;

import Polybot.polybot.aspects.InstructionAspect;
import Polybot.polybot.aspects.MoveAspectMoveAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import polybot.Move;

@Aspect(className = Move.class)
@SuppressWarnings("all")
public abstract class MoveAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final Move _self) {
    final Polybot.polybot.aspects.MoveAspectMoveAspectProperties _self_ = Polybot.polybot.aspects.MoveAspectMoveAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.Move){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.MoveAspect._privk3_exec(_self_, (polybot.Move)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Move", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static void exec(final Move _self, final int speed, final int duration) {
    final Polybot.polybot.aspects.MoveAspectMoveAspectProperties _self_ = Polybot.polybot.aspects.MoveAspectMoveAspectContext.getSelf(_self);
    	// BeginInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.GoToAspect
    		if (_self instanceof polybot.GoTo){
    			Polybot.polybot.aspects.GoToAspect.exec((polybot.GoTo)_self,speed,duration);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.GoToAspect
    	// BeginInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.ForwardAspect
    		if (_self instanceof polybot.Forward){
    			Polybot.polybot.aspects.ForwardAspect.exec((polybot.Forward)_self,speed,duration);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.ForwardAspect
    	// BeginInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.LeftAspect
    		if (_self instanceof polybot.Left){
    			Polybot.polybot.aspects.LeftAspect.exec((polybot.Left)_self,speed,duration);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.LeftAspect
    	// BeginInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.ReverseAspect
    		if (_self instanceof polybot.Reverse){
    			Polybot.polybot.aspects.ReverseAspect.exec((polybot.Reverse)_self,speed,duration);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.ReverseAspect
    	// BeginInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.RightAspect
    		if (_self instanceof polybot.Right){
    			Polybot.polybot.aspects.RightAspect.exec((polybot.Right)_self,speed,duration);
    		} else
    		// EndInjectInto Polybot.polybot.aspects.MoveAspect#void exec(int,int) from Polybot.polybot.aspects.RightAspect
    // #DispatchPointCut_before# void exec(int,int)
    if (_self instanceof polybot.Move){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.MoveAspect._privk3_exec(_self_, (polybot.Move)_self,speed,duration);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {speed,duration}, command, "Move", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final MoveAspectMoveAspectProperties _self_, final Move _self) {
    MoveAspect.exec(_self, _self.getSpeed(), _self.getDuration());
  }
  
  protected static void _privk3_exec(final MoveAspectMoveAspectProperties _self_, final Move _self, final int speed, final int duration) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
