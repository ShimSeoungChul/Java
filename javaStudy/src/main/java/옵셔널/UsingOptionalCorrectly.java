package 옵셔널;

import java.util.Optional;

public class UsingOptionalCorrectly {
	class Cart{
	}

	public static void main(String args[]){


		Optional<Cart> cart = null;

		// 나쁜 사용법, NPE발생
		Cart myCart = cart.get();

		// 올바른 사용법
		if(cart.isPresent()){
			Cart myCart2 = cart.get();
		}

	}
}
