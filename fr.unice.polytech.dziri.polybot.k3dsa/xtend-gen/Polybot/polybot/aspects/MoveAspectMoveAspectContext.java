package Polybot.polybot.aspects;

import Polybot.polybot.aspects.MoveAspectMoveAspectProperties;
import java.util.Map;
import polybot.Move;

@SuppressWarnings("all")
public class MoveAspectMoveAspectContext {
  public final static MoveAspectMoveAspectContext INSTANCE = new MoveAspectMoveAspectContext();
  
  public static MoveAspectMoveAspectProperties getSelf(final Move _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.MoveAspectMoveAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Move, MoveAspectMoveAspectProperties> map = new java.util.WeakHashMap<polybot.Move, Polybot.polybot.aspects.MoveAspectMoveAspectProperties>();
  
  public Map<Move, MoveAspectMoveAspectProperties> getMap() {
    return map;
  }
}
